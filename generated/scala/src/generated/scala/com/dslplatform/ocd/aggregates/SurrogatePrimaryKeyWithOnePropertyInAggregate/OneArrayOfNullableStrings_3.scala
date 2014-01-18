package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableStrings: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableStrings_3("+ URI +")"

   def copy(oneArrayOfNullableStrings: Array[Option[String]] = this._oneArrayOfNullableStrings): OneArrayOfNullableStrings_3 = {

  require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    new OneArrayOfNullableStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableStrings = oneArrayOfNullableStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableStrings_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableStrings = result._oneArrayOfNullableStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfNullableStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableStrings = {
    _oneArrayOfNullableStrings
  }

  def oneArrayOfNullableStrings_= (value: Array[Option[String]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStrings") oneArrayOfNullableStrings: Array[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableStrings = if (oneArrayOfNullableStrings == null) Array.empty else oneArrayOfNullableStrings)

}

object OneArrayOfNullableStrings_3 extends AggregateRootCompanion[OneArrayOfNullableStrings_3]{

  def apply(
    oneArrayOfNullableStrings: Array[Option[String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStrings)
    require(oneArrayOfNullableStrings ne null, "Null value was provided for property \"oneArrayOfNullableStrings\"")
    new OneArrayOfNullableStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableStrings = oneArrayOfNullableStrings)
  }

}
