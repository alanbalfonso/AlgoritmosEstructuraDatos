import java.util.Date;

public class Estudiante {
    private int id;
    private String apellido;
    private int edad;
    private Date fechaIngreso;
    
    public Estudiante(int id ,String apellido,int edad, Date fechaIngreso){
        this.id = id;
        this.apellido = apellido;
        this.edad= edad;
        this.fechaIngreso=fechaIngreso;
}
                    
    public Estudiante(){
    };
    public int  GetId(){
        return id;
    }
    public void SetId(int id)
    {
        this.id= id;
    }
    public  String GetApellido()
    {
    return apellido;
    }
    
    public void SetApellido(String apellido)
    {
        this.apellido= apellido; 
    }
    
    public int GetEdad(){
            return edad;
    }
    
    public void SetEdad(int edad )
    {
        this.edad = edad;
    }
    
    public Date GetFechaIngreso(){
        return fechaIngreso;
    }
    public void SetFechaIngreso (Date fechaIngreso)
    {
        this.fechaIngreso= fechaIngreso;
    }
    @Override
    public String toString(){
        return "Estudiante [id = " + id + ", apellido = " + apellido + ", edad= " + edad + ", fechaIngreso " + fechaIngreso +
            "]";
    } 
    
}