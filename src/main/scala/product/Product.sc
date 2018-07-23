def general(f: Int => Int) (a: Int, b: Int) (g: (Int, Int) => Int): Int = {
  if (a > b) 1
  else g(f(a), general(f) (a + 1, b) (g))
}

def factFromGeneral(n: Int) = general(x => x) (1, n) (pr)

def pr(x: Int, y: Int): Int = x * y

factFromGeneral(5)
