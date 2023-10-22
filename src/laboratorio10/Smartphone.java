/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author USER
 */
public class Smartphone implements Camara, ReproductorDeMusica, 
        NavegadorDeInternet{
        private String marca;
	private String modelo;

	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return this.modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}
        
        @Override
	public void grabarVideo(){
		System.out.println("Grabando!!!");
	}
        @Override
	public void tomarFoto(){
		System.out.println("Fotografeando!!!");
	}
        @Override
	public void ponerPlay(){
		System.out.println("Reproduciendo!!!");
	}
        @Override
	public void ponerPause(){
		System.out.println("Dejar de reproducir!!!");
	}
        @Override    
	public void buscar(){
		System.out.println("Buscando!!!");
	}

    @Override
	public void actualizar(){
		System.out.println("Actualizando!!!");
	}
}
