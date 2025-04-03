
package agenda;

import controllers.CtrlInicio;
import views.FrmInicio;

public class Agenda {

    public static void main(String[] args) {
        FrmInicio frmInicio = new FrmInicio();
        CtrlInicio ctrlInicio = new CtrlInicio(frmInicio);
        frmInicio.setVisible(true);
        frmInicio.setLocationRelativeTo(null);
    }
    
}
