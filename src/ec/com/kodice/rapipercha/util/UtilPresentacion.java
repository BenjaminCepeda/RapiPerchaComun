/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.kodice.rapipercha.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene los atributos y metodos de un Util
 * @author Benjamin Cepeda
 * @version v1.0
 * @date 2020/12/10 
 */
public class UtilPresentacion {
    // TODO Cargar ícono aplicacion

    static final String TITULO_NOTIFICACION = "RapiPercha - Notificación";
    static final String TITULO_CONFIRMACION = "RapiPercha - Confirmación";
    static final String TITULO_ERROR = "RapiPercha - Error del Sistema";
    static final String TITULO_VALIDACION_INCORRECTA 
            = "RapiPercha - Validación incorrecta";
    public static final String MENSAJE_REGISTRO_INGRESADO 
            = "Registro ingresado correctamente";
    public static final String MENSAJE_REGISTRO_ACTUALIZADO 
            = "Registro actualizado correctamente";
    public static final String MENSAJE_REGISTRO_ELIMINADO 
            = "Registro ha sido eliminado";
    public static final String MENSAJE_REGISTRO_ERROR 
            = "No se pudo realizar la transaccion";
    public static final String MENSAJE_VALIDACION_INCORRECTA 
            = "La siguiente información es incorrecta: \n ";
    public static final String MENSAJE_ERROR 
            = "Se ha producido el siguiente error: \n ";  
    
    public static void mostrarMensajeInformativo(Component padre, 
            String mensaje){
        JOptionPane.showMessageDialog(padre, mensaje, TITULO_NOTIFICACION, 
                JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public static int mostrarMensajeConfirmacion(Component padre, 
            String mensaje){
        return(JOptionPane.showConfirmDialog(padre, mensaje, 
                TITULO_CONFIRMACION, JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE));                                
    }

    public static void mostrarMensajeError(Component padre, String mensaje){
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(padre, MENSAJE_ERROR + mensaje, 
                TITULO_ERROR, JOptionPane.ERROR_MESSAGE);        
    }

    public static void mostrarMensajeValidacionIncorrecta(Component padre, 
            String mensaje){
        JOptionPane.showMessageDialog(padre, mensaje, 
                TITULO_VALIDACION_INCORRECTA, JOptionPane.ERROR_MESSAGE);        
    }
}
