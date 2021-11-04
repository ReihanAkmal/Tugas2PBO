public class Main {
    public static void main(String[]args) {
        GameCharacter pemain1 = new GameCharacter("Mez0tiC",44,70);
        GameCharacter pemain2 = new GameCharacter("Talent",45,50);
        pemain1.kick(pemain2);
        pemain2.kick(pemain1);
        for (int i=0;i<3;i++){
            pemain2.hit(pemain1);
        }
        for (int i=0;i<4;i++){
            pemain1.kick(pemain2);
        }
        System.out.println("Mez0tiC = "+pemain1.getLifepoint());
        System.out.println("Talent = "+pemain2.getLifepoint());


        pemain1.compare(pemain2);
    }
}

