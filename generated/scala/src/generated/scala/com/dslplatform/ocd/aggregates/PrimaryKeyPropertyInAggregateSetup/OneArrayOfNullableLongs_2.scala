package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableLongs_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableLongs: Array[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableLongs_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableLongs_2("+ URI +")"

   def copy(oneArrayOfNullableLongs: Array[Option[Long]] = this._oneArrayOfNullableLongs): OneArrayOfNullableLongs_2 = {

  require(oneArrayOfNullableLongs ne null, "Null value was provided for property \"oneArrayOfNullableLongs\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableLongs)
    new OneArrayOfNullableLongs_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableLongs = oneArrayOfNullableLongs)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableLongs_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableLongs = result._oneArrayOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableLongs_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableLongs = {
    _oneArrayOfNullableLongs
  }

  def oneArrayOfNullableLongs_= (value: Array[Option[Long]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _oneArrayOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLongs") oneArrayOfNullableLongs: Array[Option[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableLongs = if (oneArrayOfNullableLongs == null) Array.empty else oneArrayOfNullableLongs)

}

object OneArrayOfNullableLongs_2 extends AggregateRootCompanion[OneArrayOfNullableLongs_2]{

  def apply(
    oneArrayOfNullableLongs: Array[Option[Long]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableLongs)
    require(oneArrayOfNullableLongs ne null, "Null value was provided for property \"oneArrayOfNullableLongs\"")
    new OneArrayOfNullableLongs_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableLongs = oneArrayOfNullableLongs)
  }

}
