function removeDuplicate(arr)
{
    let unique=[]
    for(let i=0; i<arr.length; i++)
    {
        let isfound=false
        for(let j=0; j<unique.length; j++)
        {
            if(arr[i]==unique[j])
            {
                isfound=true
                break
            }
        }
        if(isfound==false)
            unique.push(arr[i])
    }
    return unique
}
console.log(removeDuplicate([0,0,5,4,8,1,2,1,8]))