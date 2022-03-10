function elevator(left, right, call){
    return Math.abs(right - call) <= Math.abs(left - call) ? "right" : "left";
}