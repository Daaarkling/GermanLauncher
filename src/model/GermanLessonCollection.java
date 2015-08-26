/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jan
 */
public class GermanLessonCollection {

	private final GermanLesson[] lessons = new GermanLesson[25];

	public GermanLessonCollection() {

		lessons[0] = new GermanLesson("FAMILIE (1)", "1.ppsx", "rgb(242,115,175)");
		lessons[1] = new GermanLesson("BERUFE (1)", "2.ppsx", "rgb(81,218,255)");
		lessons[2] = new GermanLesson("BERUFE (2)", "3.ppsx", "rgb(81,218,255)");
		lessons[3] = new GermanLesson("EINKAUFEN (1)", "4.ppsx", "rgb(178,227,137)");
		lessons[4] = new GermanLesson("EINKAUFEN (2)", "5.ppsx", "rgb(178,227,137)");
		lessons[5] = new GermanLesson("KLEIDUNG UND MODE (1)", "6.ppsx", "rgb(216,176,136)");
		lessons[6] = new GermanLesson("KLEIDUNG UND MODE (2)", "7.ppsx", "rgb(216,176,136)");
		lessons[7] = new GermanLesson("ESSEN UND TRINKEN (1)", "8.ppsx", "rgb(254,212,108)");
		lessons[8] = new GermanLesson("ESSEN UND TRINKEN (2)", "9.ppsx", "rgb(254,212,108)");
		lessons[9] = new GermanLesson("ESSEN UND TRINKEN (3)", "10.ppsx", "rgb(254,212,108)");
		lessons[10] = new GermanLesson("WETTER UND JAHRESZEITEN (1)", "11.ppsx", "rgb(81,218,255)");
		lessons[11] = new GermanLesson("WETTER UND JAHRESZEITEN (2)", "12.ppsx", "rgb(81,218,255)");
		lessons[12] = new GermanLesson("CHARAKTERISTIK (1)", "13.ppsx", "rgb(178,227,137)");
		lessons[13] = new GermanLesson("CHARAKTERISTIK (2)", "14.ppsx", "rgb(178,227,137)");
		lessons[14] = new GermanLesson("MEINE LEKTÜRE (1)", "15.ppsx", "rgb(171,185,222)");
		lessons[15] = new GermanLesson("SPORT (1)", "16.ppsx", "rgb(178,227,137)");
		lessons[16] = new GermanLesson("SPORT (2)", "17.ppsx", "rgb(178,227,137)");
		lessons[17] = new GermanLesson("WOHNEN (1)", "18.ppsx", "rgb(254,212,108)");
		lessons[18] = new GermanLesson("WOHNEN (2)", "19.ppsx", "rgb(254,212,108)");
		lessons[19] = new GermanLesson("MODERNE KOMMUNIKATION (1)", "20.ppsx", "rgb(242,115,175)");
		lessons[20] = new GermanLesson("REISEN (1)", "21.ppsx", "rgb(81,218,255)");
		lessons[21] = new GermanLesson("HOBBYS (1)", "22.ppsx", "rgb(171,185,222)");
		lessons[22] = new GermanLesson("SCHULE (1)", "23.ppsx", "rgb(242,115,175)");
		lessons[23] = new GermanLesson("GESUNDHEIT (1)", "24.ppsx", "rgb(216,176,136)");

		GermanLesson help = new GermanLesson("NÁPOVĚDA", "help.pdf", "black");
		help.getStyleClass().add("button-extra");
		lessons[24] = help;
				
	}

	public GermanLesson[] getLessons() {
		return lessons;
	}

	
	
	
	
	
	
}
