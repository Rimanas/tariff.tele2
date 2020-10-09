public class Main {
    public static void main(String[] args) {
        new Tariff();
        Tariff tariff = new Tariff();
        tariff.name = "Везде Онлайн";
        tariff.minutes = 500;
        tariff.gigabytes = 40;
        tariff.sms = 0;
        tariff.unlimitedMinutes = true;
        tariff.unlimitedVk = true;
        tariff.unlimitedFacebook = true;
        tariff.unlimitedInstagram = true;
        tariff.unlimitedOk = true;
        tariff.unlimitedWhatsApp = true;
        tariff.unlimitedYouTube = false;
        System.out.println(tariff.name);
        System.out.println(tariff.minutes);
        System.out.println(tariff.gigabytes);
        System.out.println(tariff.sms);
        System.out.println(tariff.unlimitedWhatsApp);
        System.out.println(tariff.unlimitedYouTube);
    }
}
