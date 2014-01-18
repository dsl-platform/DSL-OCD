package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneGuids_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneGuids: Option[Array[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneGuids_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneGuids_2("+ URI +")"

   def copy(nullableArrayOfOneGuids: Option[Array[java.util.UUID]] = this._nullableArrayOfOneGuids): NullableArrayOfOneGuids_2 = {

  require(nullableArrayOfOneGuids ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
  if(nullableArrayOfOneGuids.isDefined) require(nullableArrayOfOneGuids.get ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneGuids)
    new NullableArrayOfOneGuids_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneGuids = nullableArrayOfOneGuids)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneGuids_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneGuids = result._nullableArrayOfOneGuids
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneGuids_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneGuids")
  def nullableArrayOfOneGuids = {
    _nullableArrayOfOneGuids
  }

  def nullableArrayOfOneGuids_= (value: Option[Array[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneGuids") nullableArrayOfOneGuids: Option[Array[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneGuids = nullableArrayOfOneGuids)

}

object NullableArrayOfOneGuids_2 extends AggregateRootCompanion[NullableArrayOfOneGuids_2]{

  def apply(
    nullableArrayOfOneGuids: Option[Array[java.util.UUID]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneGuids)
    require(nullableArrayOfOneGuids ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
    if (nullableArrayOfOneGuids.isDefined) require(nullableArrayOfOneGuids.get ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
    new NullableArrayOfOneGuids_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneGuids = nullableArrayOfOneGuids)
  }

}
