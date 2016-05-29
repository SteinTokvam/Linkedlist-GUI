public class Lenkeliste{
    Node foran = null;

    public void settInnNode(String s){
      if(foran == null){
        foran = new Node();
        foran.settInn(s);
      }else{
        Node temp = new Node();
        temp.settInn(s);
        temp.neste = foran;
        foran = temp;
      }
    }

    public String printAlle(){
      Node print = foran;
      String s = "";
      while(print != null){
        s += print.getInnhold() + "\n";
        print = print.neste;
      }
      return s;
    }
}

class Node{
  protected Node neste = null;
  private String innhold;

  public void settInn(String s){
    innhold = s;
  }

  public String getInnhold(){
    return innhold;
  }
}
