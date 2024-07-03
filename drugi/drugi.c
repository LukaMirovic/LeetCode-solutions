struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    bool flag1=false;
    bool flag2=false;
    int flag=0;
    struct ListNode* start=malloc(sizeof(struct ListNode));
    struct ListNode* curr=start;
    bool poc=false;
    while(true){
        if(l1==NULL){
            flag1=true;
        }
        if(l2==NULL){
            flag2=true;
        }
        if(flag1 || flag2){
            break;
        }

            if(poc==false){
                poc=true;
            }else{
                curr=curr->next;
            }
            int sum=l1->val+l2->val+flag;
            if(sum>=10){
                flag=1;
            }else{
                flag=0;
            }
            sum%=10;
            curr->val=sum;
            curr->next=malloc(sizeof(struct ListNode));

            l1=l1->next;
            l2=l2->next;


    }
    while(true){
        if(l1==NULL){
            break;
        }
        if(poc==false){
            poc=true;
        }else{
            curr=curr->next;
        }
        int sum=l1->val+flag;
        if(sum>=10){
            flag=1;
        }else{
            flag=0;
        }
        sum%=10;
        curr->val=sum;
        curr->next=malloc(sizeof(struct ListNode));
        l1=l1->next;
    }
    while(true){
        if(l2==NULL){
            break;
        }
        if(poc==false){
            poc=true;
        }else{
            curr=curr->next;
        }

        int sum=l2->val+flag;
        if(sum>=10){
            flag=1;
        }else{
            flag=0;
        }
        sum%=10;
        curr->val=sum;
        curr->next=malloc(sizeof(struct ListNode));
        l2=l2->next;
    }
    if(flag==1){
        curr->next=malloc(sizeof(struct ListNode));
        curr=curr->next;
        curr->val=1;
    }
    curr->next=NULL;
    return start;
}
