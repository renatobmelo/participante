public class testeParticipante {

	public static void main(String[] args) {
		Participante joao = new Participante("joao@gmail.com", "joao", 17);
		Participante maria = new Participante ("maria@gmail.com","maria",30);
		Participante pedro = new Participante ("pedro@gmail.com","pedro",70);
		Convidado paulo = new Convidado("paulo@gmail.com", "paulo", 17, "IFPB");
		Convidado katia = new Convidado("katia@gmail.com", "katia", 30, "IFPB");
		Convidado antonio = new Convidado("antonio@gmail.com", "antonio", 70, "IFPB");
		System.out.println("\nvalores pagos pelos participantes para um evento de R$ 1000");
		System.out.println("João = R$ " +joao.getValorPago(1000));
		System.out.println("Maria = R$ " +maria.getValorPago(1000));
		System.out.println("Pedro = R$ " +pedro.getValorPago(1000));
		System.out.println("\nvalores pagos pelos convidados para um evento de R$ 1000");
		System.out.println("Paulo = R$ " +paulo.getValorPago(1000));
		System.out.println("Katia = R$ " +katia.getValorPago(1000));
		System.out.println("Antonio = R$ " +antonio.getValorPago(1000));
	
	}
	
	
}
