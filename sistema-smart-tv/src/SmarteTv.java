// objeto ->  Smarte tv

public class SmarteTv {
  // atributos
  boolean ligada = false;
  int canal= 1;
  int volume=25;
  String streeming = "Netflex";



  // meus Metodos

  public void escolhaStreemig(){
    streeming = "Amazon Prime";
  }
  public void ligar() {
    ligada = true;
    
  }
  public void desligar() {
    ligada = false;

  }

  public void escolhaCanal(){
    canal++;
  }
}
