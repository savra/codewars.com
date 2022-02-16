function isPalindrome(x) {
    let sourceString = x.toLowerCase();
    let revertString = "";

    for(let i = sourceString.length - 1; i >= 0; i--) {
        revertString += sourceString[i];
    }

    return (sourceString === revertString);
}