package controllers;

import java.awt.event.InputEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerFanatico{
	
	@FXML Button btnGuardar;
	@FXML VBox vboxEscena;
	@FXML HBox hboxBotones;
	@FXML TextField txtNombre;
	
	public void initialize()
	{
		asignarManejoEventos();
		
	}

	private void asignarManejoEventos() {
		/*btnGuardar.setOnDragDetected(
				e -> System.out.println("Oye no me arrastres como a Rody!"));
		*/
		
		txtNombre.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>()
				{

					@Override
					public void handle(KeyEvent event) {
						System.out.println("Entro");
						if(event.getText().contains("#"))
						{
							System.out.println("No ponga numerales en el nombre");
						}
					}
			
				}
		);
		
		btnGuardar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if(!verificarNombreValido())
				{
					System.out.println("Ingrese un nombre valido");
					event.consume();
				}
				
			}
			
		});
		
		btnGuardar.setOnMouseClicked(e -> System.out.println("Clickeo con el mouse el boton Guardar."));
		btnGuardar.setOnMouseEntered(e -> System.out.println("Te entro el mouse"));
		btnGuardar.setOnMouseExited(e -> System.out.println("Te sacaron el mouse"));
		btnGuardar.setOnMousePressed(e -> System.out.println("Te presionaron el mouse"));
		
		
		btnGuardar.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				System.out.println("Presiono la tecla" + event.getCode());
				testEvento();
			}
			
			public void testEvento()
			{
				System.out.println("Prueba nama");
			}
		});
		
		btnGuardar.setOnKeyReleased(e -> System.out.println("Solto la tecla " + e.getCode()));
		
		EventHandler<Event> manejadorEventoFaltaNombre = new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				if(txtNombre.getText()==null || txtNombre.getText().equals(""))
				{
					System.out.println("Evento filtrado: " + event.getEventType());
					event.consume();
				}
			}
			
		};
		btnGuardar.addEventFilter(KeyEvent.ANY, manejadorEventoFaltaNombre);
		btnGuardar.addEventFilter(MouseEvent.ANY, manejadorEventoFaltaNombre);
		btnGuardar.removeEventFilter(MouseEvent.ANY, manejadorEventoFaltaNombre);
		
		EventHandler<ActionEvent> evento = e -> System.out.println("Evento" + e.getEventType());
		btnGuardar.setOnAction(evento);
		/*
		btnGuardar.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Nivel 1 subida: Evento Boton. Clic finalizado"));
		btnGuardar.addEventHandler(MouseEvent.DRAG_DETECTED, e -> System.out.println("Oye no me arrastres como a Rody 2!"));
		btnGuardar.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> System.out.println("Nivel 1 subida: Evento soltar clic."));
		btnGuardar.addEventFilter(MouseEvent.ANY, e -> System.out.println("Filtro boton guardar cualquier evento mouse"));
		btnGuardar.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> System.out.println("Filtro boton guardar evento entrada mouse"));
		
		hboxBotones.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Nivel 2 subida: Evento HBox"));
		vboxEscena.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Nivel 3 subida: Evento VBox"));
		
		vboxEscena.addEventFilter(MouseEvent.MOUSE_CLICKED, e-> System.out.println("Nivel Alto Filtro: Evento Filtrado en VBox"));
		hboxBotones.addEventFilter(MouseEvent.MOUSE_CLICKED, e-> {System.out.println("Nivel Medio Filtro: Evento Filtrado en Hbox");
		e.consume();
		});
		*/
	}

	protected boolean verificarNombreValido() {
		String nombre = txtNombre.getText();
		return nombre.matches("[a-zA-Z]+");
		
		
	}

}
