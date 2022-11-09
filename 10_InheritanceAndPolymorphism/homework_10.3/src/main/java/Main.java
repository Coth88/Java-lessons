public class Main {

  public static void main(String[] args) {
    PhysicalPerson physicalPerson = new PhysicalPerson();
    physicalPerson.put(200);
    System.out.println(physicalPerson.getAmount());
    physicalPerson.accountInformation();

    LegalPerson legalPerson = new LegalPerson();
    legalPerson.put(120);
    legalPerson.take(20);
    legalPerson.accountInformation();

    IndividualBusinessman individualBusinessman = new IndividualBusinessman();
    individualBusinessman.put(500);
    individualBusinessman.put(1500);
    individualBusinessman.take(200);
    individualBusinessman.accountInformation();


  }

}
