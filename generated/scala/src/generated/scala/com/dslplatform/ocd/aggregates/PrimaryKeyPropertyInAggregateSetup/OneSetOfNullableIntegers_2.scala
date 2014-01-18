package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableIntegers_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableIntegers: Set[Option[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableIntegers_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableIntegers_2("+ URI +")"

   def copy(oneSetOfNullableIntegers: Set[Option[Int]] = this._oneSetOfNullableIntegers): OneSetOfNullableIntegers_2 = {

  require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)
    new OneSetOfNullableIntegers_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableIntegers = oneSetOfNullableIntegers)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableIntegers_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableIntegers = result._oneSetOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableIntegers_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfNullableIntegers")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableIntegers = {
    _oneSetOfNullableIntegers
  }

  def oneSetOfNullableIntegers_= (value: Set[Option[Int]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIntegers") oneSetOfNullableIntegers: Set[Option[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableIntegers = if (oneSetOfNullableIntegers == null) Set.empty else oneSetOfNullableIntegers)

}

object OneSetOfNullableIntegers_2 extends AggregateRootCompanion[OneSetOfNullableIntegers_2]{

  def apply(
    oneSetOfNullableIntegers: Set[Option[Int]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableIntegers)
    require(oneSetOfNullableIntegers ne null, "Null value was provided for property \"oneSetOfNullableIntegers\"")
    new OneSetOfNullableIntegers_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableIntegers = oneSetOfNullableIntegers)
  }

}
