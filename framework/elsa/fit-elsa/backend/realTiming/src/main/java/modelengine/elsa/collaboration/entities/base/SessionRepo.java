/*---------------------------------------------------------------------------------------------
 *  Copyright (c) 2025 Huawei Technologies Co., Ltd. All rights reserved.
 *  This file is a part of the ModelEngine Project.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

package modelengine.elsa.collaboration.entities.base;

/**
 * 协同信息持久化接口
 * 持久化session里所有信息，供回放和重现过程数据
 *
 * @author jsbjfkbsjk
 * @since 2025-07-25
 */
public interface SessionRepo {
    void save(Session session);
}
