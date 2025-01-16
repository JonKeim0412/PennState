def IsDivisible(Num1,Num2):
    try:
        Num1 = int(Num1)
        Num2 = int(Num2)
        if Num1%Num2==0:
            return True
        else:
            return False
    except:
        print('please try again, your input wa sincorrect')
    
    
