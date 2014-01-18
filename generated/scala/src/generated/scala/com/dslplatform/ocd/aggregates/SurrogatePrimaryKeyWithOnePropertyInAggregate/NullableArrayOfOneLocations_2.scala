package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneLocations_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneLocations_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneLocations_2("+ URI +")"

   def copy(nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]] = this._nullableArrayOfOneLocations): NullableArrayOfOneLocations_2 = {

  require(nullableArrayOfOneLocations ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
  if(nullableArrayOfOneLocations.isDefined) require(nullableArrayOfOneLocations.get ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneLocations)
    new NullableArrayOfOneLocations_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneLocations = nullableArrayOfOneLocations)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneLocations_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneLocations = result._nullableArrayOfOneLocations
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneLocations_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneLocations")
  def nullableArrayOfOneLocations = {
    _nullableArrayOfOneLocations
  }

  def nullableArrayOfOneLocations_= (value: Option[Array[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneLocations") nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneLocations = nullableArrayOfOneLocations)

}

object NullableArrayOfOneLocations_2 extends AggregateRootCompanion[NullableArrayOfOneLocations_2]{

  def apply(
    nullableArrayOfOneLocations: Option[Array[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneLocations)
    require(nullableArrayOfOneLocations ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
    if (nullableArrayOfOneLocations.isDefined) require(nullableArrayOfOneLocations.get ne null, "Null value was provided for property \"nullableArrayOfOneLocations\"")
    new NullableArrayOfOneLocations_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneLocations = nullableArrayOfOneLocations)
  }

}
