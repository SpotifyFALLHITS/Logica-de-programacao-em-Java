public class Aluno extends Pessoa{
    private Faculdade faculdade;

    public void setFaculdade(Faculdade faculdade){
        this.faculdade = faculdade;
    }
    public Faculdade getFaculdade(){
        return this.faculdade;
    }
}
