/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.jaxrs.ext.search;

/**
 * Captures the converted search expression.
 */
public interface QueryContext {
    
    /**
     * Uses {@link SearchBean} and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    String getConvertedExpression();
    
    /**
     * Uses a custom bean and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    <T> String getConvertedExpression(Class<T> beanClass);
    
    /**
     * Uses a custom bean and query classes and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    <T, E> E getConvertedExpression(Class<T> beanClass, Class<E> queryClass);
    
    /**
     * Uses {@link SearchBean} and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    String getConvertedExpression(String originalExpression);
    
    /**
     * Uses a custom bean and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    <T> String getConvertedExpression(String originalExpression, Class<T> beanClass);
    
    /**
     * Uses a custom bean and query classes and a visitor registered with 
     * "search.visitor" contextual property to capture and 
     * convert the original expression
     * 
     * @return converted search expression
     */
    <T, E> E getConvertedExpression(String originalExpression, Class<T> beanClass, Class<E> queryClass);
}
