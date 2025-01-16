def year():
    x = int(input('What year were you born: \n'))
    def calc(x=x, y=2022):
        return y - x
    print(calc())
