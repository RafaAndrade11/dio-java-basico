public enum EstadoBrasileiro {

    /*
     * ENUM é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponípveis por toda a aplicação
     * 
     * Usamos ENUM quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de pré´-estabelecida com
     * a certeza de não haver tanta alteração de valores.
     * 
     */

    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão"),
    CEARA ("CE", "Ceará");

    private String nome;
    private String sigla;
    
    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}