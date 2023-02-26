package EFM_REGIONAL_KOTLINV1

class exercice1 {

    fun String.isEmptyOrBlank(){
        if (isEmpty()){ println("is empty") }
        if(isBlank()) { println("is blank") }
    }

    fun String.acronym(): String {
        val mots= this.split(" ").filter { it.isNotBlank() }
        val acronym = StringBuilder()
        for (mot in mots) {
            acronym.append(mot[0].uppercase())
        }
        return acronym.toString()
    }


}