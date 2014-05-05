package Tarea02.cl;

public class Panel {
	private int largo;
	private int ancho;
	private String color;
	private String forma;
	
	public Panel(int largo, int ancho){
		this.largo = largo;
		this.ancho = ancho;
	
	}
	
	public int getLargo(){
		return largo;
	}
	
	public void setLargo(int largo){
		this.largo = largo;
	}
	
	public int getAncho(){
		return ancho;
	}
	
	public void setAncho(int ancho){
		this.ancho = ancho;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getForma(){
		return forma;
	}
	
	public void setForma(String forma){
		this.forma=forma;
	}
}
