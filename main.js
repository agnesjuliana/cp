function triangle(val) {
    let alphabet = ['a', 'a', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 
    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    let lastAccess = 0;

    console.log(val)
    for (let i = 1; i < val+1; i++) {
        let temp = []
        temp.push(alphabet[lastAccess])
        lastAccess = lastAccess+1

        if (lastAccess > 27) {
            lastAccess = 0
        }

        for (let j = 0; j < i-1; j++) {
            if(i == val && j == val-2) {
                temp.push('+')
            } else {
                temp.push(alphabet[lastAccess])

                lastAccess= lastAccess+1
                if (lastAccess > 27) {
                    lastAccess = 0
                }
            }
        }
        console.log(temp.join(' ')); 
    }
}

triangle(8);
