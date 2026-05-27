    function removeDuplicate(arr)
    {
        let unique={}
        let res=[]
        for(let i=0; i<arr.length; i++)
        {
            unique[arr[i]]=(unique[arr[i]]||0)+1
        }
        
        for(let ele in unique)
        {
            if(unique[ele]>1)
               res.push(Number(ele))
        }
        return res
    }
    console.log(removeDuplicate([0,0,5,4,8,1,2,1,8]))