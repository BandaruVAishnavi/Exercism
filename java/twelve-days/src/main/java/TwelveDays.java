class TwelveDays {
    String verse(int verseNumber) {
        String dayVerse = "On the ";
        switch(verseNumber){
            case 1: dayVerse+="first ";
                break;
            case 2: dayVerse+="second ";
                break;
            case 3: dayVerse+="third ";
                break;
            case 4: dayVerse+="fourth ";
                break;
            case 5: dayVerse+="fifth ";
                break;
            case 6: dayVerse+="sixth ";
                break;
            case 7: dayVerse+="seventh ";
                break;
            case 8: dayVerse+="eighth ";
                break;
            case 9: dayVerse+="ninth ";
                break;
            case 10: dayVerse+="tenth ";
                break;
            case 11: dayVerse+="eleventh ";
                break;
            case 12: dayVerse+="twelfth ";
                break;
        }
        dayVerse+="day of Christmas my true love gave to me: ";
        switch(verseNumber){
            case 12: dayVerse+="twelve Drummers Drumming, ";
            case 11: dayVerse+="eleven Pipers Piping, ";
            case 10: dayVerse+="ten Lords-a-Leaping, ";
            case 9: dayVerse+="nine Ladies Dancing, ";
            case 8: dayVerse+="eight Maids-a-Milking, ";
            case 7: dayVerse+="seven Swans-a-Swimming, ";
            case 6: dayVerse+="six Geese-a-Laying, ";
            case 5: dayVerse+="five Gold Rings, ";
            case 4: dayVerse+="four Calling Birds, ";
            case 3: dayVerse+="three French Hens, ";
            case 2: dayVerse+="two Turtle Doves, and ";
            case 1: dayVerse+="a Partridge in a Pear Tree.\n";
        }
        return dayVerse;
    }

    String verses(int startVerse, int endVerse) {
        String dayVerse = "";
        int i;
        for(i=startVerse; i<endVerse; i++){
            dayVerse+=this.verse(i);
            dayVerse+="\n";
        }
        dayVerse+=this.verse(i);
        return dayVerse;
    }
    
    String sing() {
        return this.verses(1,12);
    }
}
