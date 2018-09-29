const minimum = (array) => {
    const first = array[0];
    if (first < array[array.length - 1]) {
        return 0;
    }
    const iter = (begin, end) => {
        let m = Math.floor((begin + end) / 2);

        if (array[m] <= array[m - 1]) {
            return m;
        } else if (array[m] < first) {
            return iter(begin, m);
        } else {
            return iter(m, end);
        }
    }
    return iter(0, array.length);
}

module.exports = minimum;
