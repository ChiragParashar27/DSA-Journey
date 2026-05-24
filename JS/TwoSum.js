let arr=[2,8,5,4,7,6]
let target=9
let found=false
for(let i=0; i<arr.length; i++)
{
    let diff=target-arr[i]
    for(let j=i+1; j<arr.length; j++)
    {
         if(arr[j]==diff)
    {
        found=true
        console.log(`found ${arr[i]} and ${arr[j]} at ${i} ${j}`)
        break
    }
    
    }
    if(found)
        break
}