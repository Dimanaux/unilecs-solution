from solution import solution

def test(function, tests):
    for data, expected in tests.items():
        actual = function(data)
        assert actual == expected, \
                "{}({}) expected to be {}, instead got {}" \
                .format(function, data, expected, actual)


strs = {
    "Mr John Smith ": "Mr%20John%20Smith%20",
}

test(solution, strs)
