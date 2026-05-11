package oop_00000107781_AngelaBenedictinSunny.week12

fun dispenseKibble(requestedGram:Int, availableGram:Int, isJammed: Boolean): Int {
    if(isJammed){
        throw DispenserJamException();
    }

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }



    return availableGram - requestedGram

}

