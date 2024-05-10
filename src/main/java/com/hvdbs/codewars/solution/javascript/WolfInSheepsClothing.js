function warnTheSheep(queue) {
    if (queue[queue.length - 1] === "wolf") {
        return "Pls go away and stop eating my sheep";
    }

    let j = 0;

    for (let i = queue.length; i >= 0; i--) {

        if (queue[i - 1] === "wolf") {
            return "Oi! Sheep number " + j + "! You are about to be eaten by a wolf!"
        }

        j++;
    }
}