/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.spin.xml.tree;

import org.camunda.spin.SpinList;

import java.util.List;

/**
 *
 * @author Sebastian Menski
 * @author Daniel Meyer
 *
 */
public abstract class SpinXmlTreeElement extends SpinXmlTreeNode<SpinXmlTreeElement> {

  /**
   * Returns the wrapped attribute for the given name under
   * the local namespace.
   *
   * @param attributeName the name of the attribute
   * @return the wrapped {@link SpinXmlTreeAttribute attribute}
   * @throws SpinXmlTreeNodeException if the attribute is not found
   */
  public abstract SpinXmlTreeAttribute attr(String attributeName);

  /**
   * Returns the wrapped attribute for the given namespace
   * and name.
   *
   * @param namespace the namespace of the attribute
   * @param attributeName the name of the attribute
   * @return the wrapped {@link SpinXmlTreeAttribute attribute}
   * @throws SpinXmlTreeNodeException if the attribute is not found
   */
  public abstract SpinXmlTreeAttribute attrNs(String namespace, String attributeName);

  /**
   * Checks whether this element has a attribute with the given name.
   *
   * @param attributeName the name of the attribute
   * @return true if the element has an attribute with this name under the local namespace, false otherwise
   */
  public abstract boolean hasAttr(String attributeName);

  /**
   * Checks whether this element has a attribute with the given name.
   *
   * @param namespace the namespace of the attribute
   * @param attributeName the name of the attribute
   * @return true if the element has an attribute with this name under given namespace, false otherwise
   * @throws SpinXmlTreeNodeException if the attributeName is null
   */
  public abstract boolean hasAttrNs(String namespace, String attributeName);

  /**
   * Returns all wrapped attributes for the local namespace.
   *
   * @return the wrapped attributes or an empty list of no attributes are found
   */
  public abstract SpinList<SpinXmlTreeAttribute> attrs();

  /**
   * Returns all wrapped attributes for the given namespace.
   *
   * @param namespace the namespace of the attributes
   * @return the wrapped attributes or an empty list of no attributes are found
   */
  public abstract SpinList<SpinXmlTreeAttribute> attrs(String namespace);

  /**
   * Returns all names of the attributes in the local namespace.
   *
   * @return the names of the attributes
   */
  public abstract List<String> attrNames();

  /**
   * Returns all names of the attributes in the given namespace.
   *
   * @return the names of the attributes
   */
  public abstract List<String> attrNames(String namespace);

  /**
   * Returns a single wrapped child element for the given name
   * in the local namespace.
   *
   * @param elementName the element name
   * @return the wrapped child {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if none or more than one child element is found
   */
  public abstract SpinXmlTreeElement childElement(String elementName);

  /**
   * Returns a single wrapped child {@link SpinXmlTreeElement element} for the given namespace
   * and name.
   *
   * @param namespace the namespace of the element
   * @param elementName the element name
   * @return the wrapped child {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if none or more than one child element is found
   */
  public abstract SpinXmlTreeElement childElement(String namespace, String elementName);

  /**
   * Returns all child elements of this {@link SpinXmlTreeElement elements}.
   *
   * @return list of wrapped child {@link SpinXmlTreeElement elements}
   */
  public abstract SpinList<SpinXmlTreeElement> childElements();

  /**
   * Returns all child {@link SpinXmlTreeElement elements} with a given name in the local namespace.
   *
   * @param elementName the element name
   * @return a collection of wrapped {@link SpinXmlTreeElement elements}
   * @throws SpinXmlTreeNodeException if no child element was found
   */
  public abstract SpinList<SpinXmlTreeElement> childElements(String elementName);

  /**
   * Returns all child {@link SpinXmlTreeElement elements} with a given namespace and name.
   *
   * @param namespace the namespace of the element
   * @param elementName the element name
   * @return a collection of wrapped {@link SpinXmlTreeElement elements}
   * @throws SpinXmlTreeNodeException if no child element was found
   */
  public abstract SpinList<SpinXmlTreeElement> childElements(String namespace, String elementName);

  /**
   * Sets the attribute value in the local namespace of the element.
   *
   * @param attributeName the name of the attribute
   * @param value the value to set
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if the name is null
   */
  public abstract SpinXmlTreeElement attr(String attributeName, String value);

  /**
   * Sets the attribute value in the given namespace.
   *
   * @param namespace the namespace of the attribute
   * @param attributeName the name of the attribute
   * @param value the value to set
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if the name is null
   */
  public abstract SpinXmlTreeElement attrNs(String namespace, String attributeName, String value);

  /**
   * Removes the attribute under the local namespace.
   *
   * @param attributeName the name of the attribute
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if the attributeName is null
   */
  public abstract SpinXmlTreeElement removeAttr(String attributeName);

  /**
   * Removes the attribute under the given namespace.
   *
   * @param namespace the namespace of the attribute
   * @param attributeName the name of the attribute
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if the attributeName is null
   */
  public abstract SpinXmlTreeElement removeAttrNs(String namespace, String attributeName);

  /**
   * Appends child elements to this {@link SpinXmlTreeElement element}.
   *
   * @param childElements the child elements to append
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws SpinXmlTreeNodeException if the child element is null
   */
  public abstract SpinXmlTreeElement append(SpinXmlTreeElement... childElements);

  /**
   * Appends a child element to this element before the existing child element.
   *
   * @param childElement the child element to append
   * @param existingChildElement the child element to append before
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws IllegalArgumentException if the child element or existing child element is null
   * @throws SpinXmlTreeNodeException if the existing child element is not a child of this element
   */
  public abstract SpinXmlTreeElement appendBefore(SpinXmlTreeElement childElement, SpinXmlTreeElement existingChildElement);

  /**
   * Appends a child element to this {@link SpinXmlTreeElement element} after the existing child {@link SpinXmlTreeElement element}.
   *
   * @param childElement the child element to append
   * @param existingChildElement the child element to append after
   * @return the wrapped {@link SpinXmlTreeElement element}
   * @throws IllegalArgumentException if the child element or existing child element is null
   * @throws SpinXmlTreeNodeException if the existing child element is not a child of this element
   */
  public abstract SpinXmlTreeElement appendAfter(SpinXmlTreeElement childElement, SpinXmlTreeElement existingChildElement);

}