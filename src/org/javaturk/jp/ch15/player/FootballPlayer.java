package org.javaturk.jp.ch15.player;

class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutesPlayed;
    int numberOfGoals;
    String team;

    void setNo(int newNo) {
        no = newNo;
    }

    void setName(String newName) {
        name = newName;
    }

    void setTeam(String newTeam) {
        team = newTeam;
    }

    void score() {
        System.out.println(name + " scored a goal :)");
        numberOfGoals++;
    }

    void play(int minutes) {
        System.out.println(name + " is in play");
        inPlay = true;
        minutesPlayed += minutes;
    }

    int getNumberOfGoals() {
        return numberOfGoals;
    }

    int getMinutesPlayed() {
        return minutesPlayed;
    }

    String getName() {
        return name;
    }

    String info() {
        return "FootballPlayer{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", inPlay=" + inPlay +
                ", minutesPlayed=" + minutesPlayed +
                ", numberOfGoals=" + numberOfGoals +
                ", team='" + team + '\'' +
                '}';
    }
}
