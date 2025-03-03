/*
 * Copyright (c) 2022 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 */
package org.eclipse.scout.contacts.shared.person;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.platform.classid.ClassId;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@ClassId("1cde38c1-da32-4fdd-92e7-28d82a5d7bf9-formdata")
@Generated(value = "org.eclipse.scout.contacts.client.person.PersonForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public City getCity() {
    return getFieldByClass(City.class);
  }

  public Country getCountry() {
    return getFieldByClass(Country.class);
  }

  public DateOfBirth getDateOfBirth() {
    return getFieldByClass(DateOfBirth.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public EmailWork getEmailWork() {
    return getFieldByClass(EmailWork.class);
  }

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public GenderGroup getGenderGroup() {
    return getFieldByClass(GenderGroup.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public Mobile getMobile() {
    return getFieldByClass(Mobile.class);
  }

  public Notes getNotes() {
    return getFieldByClass(Notes.class);
  }

  public Organization getOrganization() {
    return getFieldByClass(Organization.class);
  }

  /**
   * access method for property PersonId.
   */
  public String getPersonId() {
    return getPersonIdProperty().getValue();
  }

  /**
   * access method for property PersonId.
   */
  public void setPersonId(String personId) {
    getPersonIdProperty().setValue(personId);
  }

  public PersonIdProperty getPersonIdProperty() {
    return getPropertyByClass(PersonIdProperty.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public PhoneWork getPhoneWork() {
    return getFieldByClass(PhoneWork.class);
  }

  public PictureUrl getPictureUrl() {
    return getFieldByClass(PictureUrl.class);
  }

  public Position getPosition() {
    return getFieldByClass(Position.class);
  }

  public Street getStreet() {
    return getFieldByClass(Street.class);
  }

  @ClassId("3ea6ac2a-976e-4c7f-b04b-ec0d7d1ae5ec-formdata")
  public static class City extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("d4dfce4f-019b-4a61-ba78-347ef67cf80f-formdata")
  public static class Country extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("7c602360-9daa-44b8-abb6-94ccf9b9db59-formdata")
  public static class DateOfBirth extends AbstractValueFieldData<Date> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("5f9d9363-8e57-4151-b281-7d401e64702c-formdata")
  public static class Email extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("7f693443-ec4e-47fb-874e-b31328cc22fb-formdata")
  public static class EmailWork extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("359be835-439f-456e-9b0d-c832b034a298-formdata")
  public static class FirstName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("b9d0593e-3938-4f97-bdca-fdb6a1ce1d77-formdata")
  public static class GenderGroup extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("8679ade5-21fb-470e-8f00-13bd15199101-formdata")
  public static class LastName extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("7dc64c60-5713-4376-a3e0-41c0a8e2b503-formdata")
  public static class Mobile extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("ce791f14-fca6-4f11-8476-89cbf905eb2e-formdata")
  public static class Notes extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("cd4a7afd-e0ac-4c79-bf2e-819aa491db27-formdata")
  public static class Organization extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class PersonIdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("136a3c0c-91bf-427c-8020-507bfd391098-formdata")
  public static class Phone extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("334720b0-75fa-400a-8305-983a7aa98549-formdata")
  public static class PhoneWork extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("617ffd40-0d69-4d02-b4f8-90c28c68c6ce-formdata")
  public static class PictureUrl extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("ee22af3c-b0a9-47a5-8931-d48a219d16b2-formdata")
  public static class Position extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("a9137ad1-af9d-4fef-a69d-3e3d9ce48f21-formdata")
  public static class Street extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }
}
