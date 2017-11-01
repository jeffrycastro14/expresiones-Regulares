package sample.controladores;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import sample.modelos.Persona;


public class Controller {

    public TextField txtApellido;
    public TextField txtNombre;
    public TextField txtEdad;
    public TextField txtBuscar;


    private Persona buscarPorNombre(ActionEvent actionEvent) {
        return Persona.buscarPorNombre(txtBuscar.getText());
    }


    public void getPersona(ActionEvent actionEvent) {
        try {
            Persona Busqueda = this.buscarPorNombre(actionEvent);

            txtNombre.setText(Busqueda.nombre);
            txtApellido.setText(Busqueda.apellido);
            txtEdad.setText(String.valueOf(Busqueda.edad));

        } catch (NullPointerException e) {


        }

    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtApellido.clear();
        txtEdad.clear();
    }



}
