
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.FrmIngresar;
import views.FrmInicio;

public class CtrlInicio implements ActionListener {
    FrmInicio frmInicio = new FrmInicio();
    
    public CtrlInicio(FrmInicio frm) {
        this.frmInicio = frm;
        this.frmInicio.BtnIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frmInicio.BtnIngresar) {
            FrmIngresar frmIngresar = new FrmIngresar();
            frmIngresar.setVisible(true);
            frmIngresar.setLocationRelativeTo(null);
        }
    }
}
