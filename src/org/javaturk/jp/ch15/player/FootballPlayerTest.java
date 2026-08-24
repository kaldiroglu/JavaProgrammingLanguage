package org.javaturk.jp.ch15.player;

class FootballPlayerTest {

    public static void main(String[] args) {
        FootballPlayer moSalah = new FootballPlayer();
        moSalah.setNo(11);
        moSalah.setName("Mo Salah");
        moSalah.setTeam("Liverpool");

        moSalah.play(90);
        moSalah.score();
        moSalah.score();

        printPlayerInfo(moSalah);

        moSalah.play(80);
        moSalah.score();

        printPlayerInfo(moSalah);
    }

    static void printPlayerInfo(FootballPlayer player){
        System.out.println("\n" + player.getName() + " played " + player.getMinutesPlayed() + " minutes and scored "
                + player.getNumberOfGoals() + " goals so far.\n");
    }
}
