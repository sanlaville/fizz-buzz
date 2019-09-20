// see https://jasmine.github.io/api/2.8/matchers.html

describe('Check test environment', function () {

    it('test should fail', function () {
        expect(1).toEqual(0);
    });

    describe('parameterized test example', function() {

        let tests = [[1, "a1"], [2, "a2"]]

        tests.forEach(test => {
            let numberInput = test[0];
            let expected = test[1];

            it(numberInput + ' should be converted to ' + expected, function () {
                let actual = "a" + numberInput
                expect(actual).toEqual(expected);
            })
        });

    });
});