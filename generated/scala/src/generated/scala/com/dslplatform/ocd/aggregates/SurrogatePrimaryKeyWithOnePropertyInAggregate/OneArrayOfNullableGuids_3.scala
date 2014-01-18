package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableGuids_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableGuids: Array[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableGuids_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableGuids_3("+ URI +")"

   def copy(oneArrayOfNullableGuids: Array[Option[java.util.UUID]] = this._oneArrayOfNullableGuids): OneArrayOfNullableGuids_3 = {

  require(oneArrayOfNullableGuids ne null, "Null value was provided for property \"oneArrayOfNullableGuids\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableGuids)
    new OneArrayOfNullableGuids_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableGuids = oneArrayOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableGuids_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableGuids = result._oneArrayOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableGuids_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableGuids = {
    _oneArrayOfNullableGuids
  }

  def oneArrayOfNullableGuids_= (value: Array[Option[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableGuids") oneArrayOfNullableGuids: Array[Option[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableGuids = if (oneArrayOfNullableGuids == null) Array.empty else oneArrayOfNullableGuids)

}

object OneArrayOfNullableGuids_3 extends AggregateRootCompanion[OneArrayOfNullableGuids_3]{

  def apply(
    oneArrayOfNullableGuids: Array[Option[java.util.UUID]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableGuids)
    require(oneArrayOfNullableGuids ne null, "Null value was provided for property \"oneArrayOfNullableGuids\"")
    new OneArrayOfNullableGuids_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableGuids = oneArrayOfNullableGuids)
  }

}
