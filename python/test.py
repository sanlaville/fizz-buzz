"""
    python -m unittest test.py
"""
import unittest

class Test(unittest.TestCase):

    def test_env(self):
        result = 1
        self.assertEqual(result, 2)



if __name__ == '__main__':
    unittest.main()
