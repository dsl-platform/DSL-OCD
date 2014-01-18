package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneBinaries_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneBinaries: Option[Array[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneBinaries_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneBinaries_2("+ URI +")"

   def copy(nullableArrayOfOneBinaries: Option[Array[Array[Byte]]] = this._nullableArrayOfOneBinaries): NullableArrayOfOneBinaries_2 = {

  require(nullableArrayOfOneBinaries ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
  if(nullableArrayOfOneBinaries.isDefined) require(nullableArrayOfOneBinaries.get ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneBinaries)
    new NullableArrayOfOneBinaries_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneBinaries = nullableArrayOfOneBinaries)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneBinaries_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneBinaries = result._nullableArrayOfOneBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneBinaries_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableArrayOfOneBinaries")
  def nullableArrayOfOneBinaries = {
    _nullableArrayOfOneBinaries
  }

  def nullableArrayOfOneBinaries_= (value: Option[Array[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneBinaries") nullableArrayOfOneBinaries: Option[Array[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneBinaries = nullableArrayOfOneBinaries)

}

object NullableArrayOfOneBinaries_2 extends AggregateRootCompanion[NullableArrayOfOneBinaries_2]{

  def apply(
    nullableArrayOfOneBinaries: Option[Array[Array[Byte]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneBinaries)
    require(nullableArrayOfOneBinaries ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
    if (nullableArrayOfOneBinaries.isDefined) require(nullableArrayOfOneBinaries.get ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
    new NullableArrayOfOneBinaries_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneBinaries = nullableArrayOfOneBinaries)
  }

}
