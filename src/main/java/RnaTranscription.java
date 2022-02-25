class RnaTranscription {

    String transcribe(String dnaStrand) {
        int dnaStrandLength = dnaStrand.length();
        String transcribedRNA = "";
        for(int currentDnaNucleotides =0;currentDnaNucleotides<dnaStrandLength;currentDnaNucleotides++)
        {
                char currentDnaModule=dnaStrand.charAt(currentDnaNucleotides);
                switch(currentDnaModule)
                {
                    case 'G':
                        transcribedRNA+='C';
                        break;
                    case 'C':
                        transcribedRNA+='G';
                        break;
                    case 'T':
                        transcribedRNA+='A';
                        break;
                    case 'A':
                        transcribedRNA+='U';
                        break;
                    default:
                         return "";
                        
                }
        }
        return transcribedRNA;
    }

}
