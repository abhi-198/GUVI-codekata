n=input()
if ord(n)>=65 and ord(n)<=124:
    if n in ("a","A","i","I","e","E","o","O","u","U"):
        print("Vowel")
    else:
        print("Consonant")
else:
    print("invalid")