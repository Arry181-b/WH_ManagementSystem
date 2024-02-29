package com.gdpu.common;

import com.gdpu.bean.TbUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
*    
*
* */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser {
    private TbUser tbUser;

    private List<String> roles;

    private List<String> permission;
}
