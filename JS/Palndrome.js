
// function isPalindrome(num)
// {
//     let k=num
//     let temp=0
//     while(k>0)
//     {
//         let d=k%10
//         temp=temp*10+d
//        k=Math.floor(k/10)
//     }
//     console.log(num==temp)
// }
// isPalindrome(136)
function isPalindrome(str)
{

    let left=0
    let right=str.length-1;
    while(left<right)
    {
        if(str[left]!==str[right])
            return false
        left++
        right--
        return true
    }
}
console.log(isPalindrome('madam'))