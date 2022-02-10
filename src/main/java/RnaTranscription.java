class RnaTranscription {

    String transcribe(String dnaStrand) {
        int total_length = dnaStrand.length();
        String transcribed_RNA = "";
        for(int current_index=0;current_index<total_length;current_index++)
        {
                char currentdnaStrand=dnaStrand.charAt(current_index);
                switch(currentdnaStrand)
                {
                    case 'G':
                        transcribed_RNA+='C';
                        break;
                    case 'C':
                        transcribed_RNA+='G';
                        break;
                    case 'T':
                        transcribed_RNA+='A';
                        break;
                    case 'A':
                        transcribed_RNA+='U';
                        break;
                    default:
                         return "";
                        
                }
        }
        return transcribed_RNA;
    }

}
