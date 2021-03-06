package Proveedores;

import Proveedores.Modelo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelProveedores extends AbstractTableModel{
    
    private String[] nombreColumnas = {"Clave","Nombre","Domicilio","Colonia","CP", "Ciudad", "Tel.Fijo", "Tel.Movil", "Correo", "Razón Social", "RFC", "Banco", "Cuenta", "Tipo"};
    private ArrayList<Modelo> cls;

    public TableModelProveedores(ArrayList<Modelo> cls) {
        this.cls = cls;
    }

    public TableModelProveedores() {
    }

    public void setProveedores(ArrayList<Modelo> cls) {
        this.cls = cls;
    }
    
    @Override
    public int getRowCount() {
        return cls.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }

    public Modelo getFila(int index)
    {
        return cls.get(index);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        switch(columnIndex)
        {
            case 0:  return cls.get(rowIndex).getPrimaryKey();
            case 1:  return cls.get(rowIndex).getNombre();
            case 2:  return cls.get(rowIndex).getDomicilio();
            case 3:  return cls.get(rowIndex).getColonia();
            case 4:  return cls.get(rowIndex).getCodigoPostal();
            case 5:  return cls.get(rowIndex).getCiudad();
            case 6:  return cls.get(rowIndex).getTelFijo();
            case 7:  return cls.get(rowIndex).getTelMovil();
            case 8:  return cls.get(rowIndex).getCorreo();
            case 9:  return cls.get(rowIndex).getRazonSocial();
            case 10: return cls.get(rowIndex).getRFC();
            case 11: return cls.get(rowIndex).getBanco();
            case 12: return cls.get(rowIndex).getNumeroCuenta();
            case 13: return cls.get(rowIndex).getTipoCuenta();
                
            default: return null;          
        }
    }
}
